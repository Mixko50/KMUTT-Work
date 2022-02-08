import 'package:flutter/material.dart';
import 'package:layout_interactive/widgets/button.dart';
import 'package:layout_interactive/widgets/description.dart';
import 'package:layout_interactive/widgets/title.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({Key? key}) : super(key: key);

  // This widget is the root of your application.
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: "Hello Mixko",
      home: Scaffold(
          appBar: AppBar(
            title: const Text("Layout Interactive"),
            backgroundColor: Colors.pink[200],
          ),
          body: card()),
    );
  }
}

Widget card() => Padding(
      padding: const EdgeInsets.all(10.0),
      child: Column(
        children: [
          const TitleName(),
          const ButtonClick(),
          ClipRRect(
            borderRadius: BorderRadius.circular(15), // Image border
            child: Image.asset("images/mixko.HEIC"),
          ),
          const Description()
        ],
      ),
    );
