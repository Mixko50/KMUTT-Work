import 'package:flutter/material.dart';

String result(bool checkEmail, bool checkPassword, String email, String password) {
  if (!checkEmail && !checkPassword){
    return "You email and password are incorrect";
  } else if (checkEmail && !checkPassword) {
    return "Your password is incorrect";
  } else if (!checkEmail && checkPassword) {
    return "Your email is incorrect";
  } else {
    return "Email: $email \nPassword: $password";
  }
}

void showAlertDialog(BuildContext context, bool checkEmail,bool checkPassword, String email, String password) {
  showDialog(
    context: context,
    builder: (BuildContext context) {
      return AlertDialog(
        title: Text((checkEmail && checkPassword) ? "Complete" : "Warning!"),
        content: Text(result(checkEmail, checkPassword, email, password)),
        actions: [
          TextButton(
            child: const Text("OK", style: TextStyle(color: Colors.pink),),
            onPressed: () {
              Navigator.of(context).pop();
            },
          ),
        ],
      );
    },
  );
}