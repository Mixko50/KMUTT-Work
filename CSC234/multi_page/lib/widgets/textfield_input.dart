import 'package:flutter/material.dart';

typedef StringCallback = void Function(String text);

class TextFieldInput extends StatefulWidget {
  final StringCallback callback;
  const TextFieldInput({Key? key, required this.callback}) : super(key: key);

  @override
  _TextFieldInputState createState() => _TextFieldInputState();
}

class _TextFieldInputState extends State<TextFieldInput> {
  final textController = TextEditingController();

  @override
  Widget build(BuildContext context) {
    return TextFormField(
      controller: textController,
      decoration: const InputDecoration(
          focusedBorder: UnderlineInputBorder(
            borderSide: BorderSide(color: Colors.pink),
          ),
          icon: Icon(
            Icons.title,
            color: Colors.pink,
          ),
          hintText: "Text"),
      onChanged: (String value) {
        widget.callback(value);
      },
    );
  }
}
