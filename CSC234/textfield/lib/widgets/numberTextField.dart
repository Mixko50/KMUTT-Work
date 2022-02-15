import 'package:flutter/material.dart';

typedef StringCallback = void Function(bool checkPassword, String password);

class PasswordTextField extends StatefulWidget {
  final StringCallback callback;
  const PasswordTextField({Key? key, required this.callback}) : super(key: key);

  @override
  _PasswordTextFieldState createState() => _PasswordTextFieldState();
}

class _PasswordTextFieldState extends State<PasswordTextField> {
  final _numberKey = GlobalKey<FormState>();
  final passwordController = TextEditingController();
  RegExp passwordValidator = RegExp(r"^[0-9A-Z]*$");

  @override
  void dispose() {
    // Clean up the controller when the widget is disposed.
    passwordController.dispose();
    super.dispose();
  }

  @override
  Widget build(BuildContext context) {
    return Form(
      key: _numberKey,
      child: Column(
        children: [
          TextFormField(
            obscureText: true,
            autofocus: true,
            controller: passwordController,
            onChanged: (String value){
              _numberKey.currentState!.validate();
            },
            decoration: const InputDecoration(
              focusedBorder: UnderlineInputBorder(
                borderSide: BorderSide(color: Colors.pink),
              ),
              icon: Icon(Icons.vpn_key, color: Colors.pink),
                hintText: "Password",
            ),
            // The validator receives the text that the user has entered.
            validator: (value) {
              if (!passwordValidator.hasMatch(value!) || value.isEmpty ) {
                widget.callback(false, value);
                return 'Please enter correct password';
              }
              widget.callback(true, value);
              return null;
            },
          ),
        ],
      ),);
  }
}
