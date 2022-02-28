import 'package:flutter/material.dart';
import 'package:multi_page/widgets/second_screen.dart';
import 'package:multi_page/widgets/textfield_input.dart';

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
      home: Scaffold(
        appBar: AppBar(
          title: const Text("Multi Page"),
          backgroundColor: Colors.pink[200],
        ),
        body: const MyHomePage(),
      ),
    );
  }
}

class MyHomePage extends StatefulWidget {
  const MyHomePage({Key? key}) : super(key: key);

  @override
  _MyHomePageState createState() => _MyHomePageState();
}

class _MyHomePageState extends State<MyHomePage> {
  String _text1 = "";
  String _text2 = "";

  @override
  Widget build(BuildContext context) {
    return Padding(
      padding: const EdgeInsets.all(10),
      child: Column(
        children: [
          Row(
            children: [
              Flexible(
                  child: TextFieldInput(
                      callback: (text) => setState(() {
                            _text1 = text;
                          }))),
              IconButton(
                  onPressed: () {
                    Navigator.push(context, MaterialPageRoute(builder: (context) => SecondScreen(textPlace: _text1, page: "1",)),);
                  },
                  icon: const Icon(
                    Icons.arrow_forward_ios,
                    color: Colors.pink,
                    size: 18,
                  ))
            ],
          ),
          Row(
            children: [
              Flexible(
                  child: TextFieldInput(
                      callback: (text) => setState(() {
                            _text2 = text;
                          }))),
              IconButton(
                  onPressed: () {
                    Navigator.push(context, MaterialPageRoute(builder: (context) => SecondScreen(textPlace: _text2, page: "2",)),);
                  },
                  icon: const Icon(
                    Icons.arrow_forward_ios,
                    color: Colors.pink,
                    size: 18,
                  ))
            ],
          )
        ],
      ),
    );
  }
}
