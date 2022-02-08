import 'package:flutter/material.dart';

class Description extends StatelessWidget {
  const Description({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return const Padding(
      padding: EdgeInsets.only(top: 20, left: 8, right: 8, bottom: 20),
      child: Text(
        "I'm currently studying at KMUTT in Bachelor of Computer Science. I'm 2nd year student that interested in application development. I'm currently learning about mobile app and web development.",
        style: TextStyle(fontSize: 16),
      ),
    );
  }
}
