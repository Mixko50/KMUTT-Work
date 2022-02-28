import 'package:flutter/material.dart';

class SecondScreen extends StatelessWidget {
  final String textPlace;
  final String page;
  const SecondScreen({Key? key, required this.textPlace, required this.page}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Flutter Demo',
      home: Scaffold(
          appBar: AppBar(
            backgroundColor: Colors.pink[200],
            leading: IconButton(
              icon: const Icon(Icons.arrow_back),
              onPressed: () => Navigator.pop(context),
            ),
            title: Text("Second Page $page"),
            centerTitle: true,
          ),
          body: Center(
            child: Column(
              mainAxisAlignment: MainAxisAlignment.center,
              children: [
                const Icon(Icons.remove),
                Text(textPlace, style: const TextStyle(
                  fontSize: 30,
                  fontWeight: FontWeight.w700
                ),),
                const Icon(Icons.remove)
              ],
            ),
          )
      ),
    );
  }
}
