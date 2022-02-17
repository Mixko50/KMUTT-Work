import 'package:flutter/material.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({Key? key}) : super(key: key);

  // This widget is the root of your application.
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
        title: 'Flutter Demo',
        theme: ThemeData(
          primarySwatch: Colors.blue,
        ),
        home: const MyHomePage());
  }
}

class MyHomePage extends StatefulWidget {
  const MyHomePage({Key? key}) : super(key: key);

  @override
  _MyHomePageState createState() => _MyHomePageState();
}

class _MyHomePageState extends State<MyHomePage> {
  final _textKey = GlobalKey<FormState>();
  String text = "";
  RegExp textValidator = RegExp(r"\d");

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text("Retrieve Text Input"),
      ),
      body: Padding(
        padding: const EdgeInsets.all(10),
        child: Form(
          key: _textKey,
          child: TextFormField(
            onChanged: (String value) {
              setState(() {
                text = value;
              });
              _textKey.currentState!.validate();
            },
            validator: (value) {
              if (value!.isEmpty) {
                return "Please enter some text";
              } else if (value.length < 8) {
                return "Please enter more than 8 characters";
              } else if (!textValidator.hasMatch(value)) {
                return "Please include number in the message";
              }
            },
          ),
        ),
      ),
      floatingActionButton: FloatingActionButton(
        onPressed: () {
          showAlertDialog(context, text);
        },
        child: const Icon(Icons.near_me),
      ),
    );
  }
}

void showAlertDialog(BuildContext context, String text) {
  showDialog(
    context: context,
    builder: (BuildContext context) {
      return AlertDialog(
        content: Text(text),
        actions: [
          TextButton(
            child: const Text("OK"),
            onPressed: () {
              Navigator.of(context).pop();
            },
          ),
        ],
      );
    },
  );
}
