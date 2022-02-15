import 'package:flutter/material.dart';
import 'package:textfield/widgets/emailTextField.dart';
import 'package:textfield/widgets/numberTextField.dart';
import 'package:textfield/widgets/submitButton.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({Key? key}) : super(key: key);

  // This widget is the root of your application.
  @override
  Widget build(BuildContext context) {
    return const _TextFieldGroup();
  }
}

class _TextFieldGroup extends StatefulWidget {
  const _TextFieldGroup({Key? key}) : super(key: key);

  @override
  _TextFieldGroupState createState() => _TextFieldGroupState();
}

class _TextFieldGroupState extends State<_TextFieldGroup> {
  bool _checkEmail = false;
  bool _checkPassword = false;
  String _email = "";
  String _password = "";

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Apisit Maneerat',
      theme: ThemeData(
        primarySwatch: Colors.blue,
      ),
      home: Scaffold(
        appBar: AppBar(
          title: const Text("TextFormField Exercise"),
          backgroundColor: Colors.pink[200],
        ),
        body: Padding(
          padding: const EdgeInsets.only(top: 20, left: 12, right: 12),
          child: Column(
            children: [
              SizedBox(
                height: 70,
                child: Row(
                mainAxisAlignment: MainAxisAlignment.center,
                    children: [
                  Flexible(
                      child: EmailTextField(
                          callback: (val, email) => setState(() {
                            _checkEmail = val;
                            _email = email;
                          }))),
                  Flexible(
                      child: PasswordTextField(
                          callback: (val, password) => setState(() {
                            _checkPassword = val;
                            _password = password;
                          })))
                ]),
              ),
              SubmitButton(checkEmail: _checkEmail, checkPassword: _checkPassword, email: _email, password: _password)
            ],
          ),
        ),
      ),
    );
  }
}
