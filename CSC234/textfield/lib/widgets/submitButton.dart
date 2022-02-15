import 'package:flutter/material.dart';
import 'package:textfield/components/alertDialog.dart';

class SubmitButton extends StatefulWidget {
  final bool checkEmail;
  final bool checkPassword;
  final String email;
  final String password;
  const SubmitButton({Key? key, required this.checkEmail, required this.checkPassword, required this.email, required this.password }) : super(key: key);

  @override
  _SubmitButtonState createState() => _SubmitButtonState();
}

class _SubmitButtonState extends State<SubmitButton> {
  @override
  Widget build(BuildContext context) {
    return Row(
      mainAxisAlignment: MainAxisAlignment.center,
      children: [
        TextButton(
            onPressed: () {
              showAlertDialog(context, widget.checkEmail, widget.checkPassword, widget.email, widget.password);
            },
            child: const Text("Submit", style: TextStyle(color: Colors.pink),))
      ],
    );
  }
}

