import 'package:flutter/material.dart';
import 'package:layout_exercise/widgets/contact.dart';
import 'package:layout_exercise/widgets/icon_and_name.dart';
import 'package:layout_exercise/widgets/icons.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({Key? key}) : super(key: key);

  // This widget is the root of your application.
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: "Hello Mixkos",
      home: Scaffold(
          appBar: AppBar(
            title: const Text("Layout Exercise"),
            backgroundColor: Colors.pink[200],
          ),
          body: card()),
    );
  }
}

Widget card() => Padding(
      padding: const EdgeInsets.all(12.0),
      child: Column(
        children: const [
          IconAndName(
              name: "Apisit Maneerat", position: "Experienced App Developer"),
          Contact(address: "123 Main Street", call: "(+66) 83 000 9999"),
          IconsProfile(),
        ],
      ),
    );
