import 'package:flutter/material.dart';

typedef StringCallback = void Function(bool checkEmail, String email);

class EmailTextField extends StatefulWidget {
  final StringCallback callback;
  const EmailTextField({Key? key, required this.callback}) : super(key: key);

  @override
  _EmailTextFieldState createState() => _EmailTextFieldState();
}

class _EmailTextFieldState extends State<EmailTextField> {
  final _emailKey = GlobalKey<FormState>();
  final emailController = TextEditingController();
  RegExp emailValidator = RegExp(r'^(([^<>()[\]\\.,;:\s@\"]+(\.[^<>()[\]\\.,;:\s@\"]+)*)|(\".+\"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$');

  @override
  void dispose() {
    // Clean up the controller when the widget is disposed.
    emailController.dispose();
    super.dispose();
  }

  @override
  Widget build(BuildContext context) {
    return Form(
      key: _emailKey,
      child: Column(
        children: [
          TextFormField(
            controller: emailController,
            onChanged: (String value) {
              _emailKey.currentState!.validate();
            },
            decoration: const InputDecoration(
                focusedBorder: UnderlineInputBorder(
                  borderSide: BorderSide(color: Colors.pink),
                ),
              icon: Icon(Icons.person, color: Colors.pink,),
              hintText: "Email"
            ),
            // The validator receives the text that the user has entered.
            validator: (value) {
              if (!emailValidator.hasMatch(value!) || value.isEmpty) {
                widget.callback(false, value);
                return 'Please enter correct email';
              }
              widget.callback(true, value);
              return null;
            },
          ),
        ],
      ),);
  }
}
