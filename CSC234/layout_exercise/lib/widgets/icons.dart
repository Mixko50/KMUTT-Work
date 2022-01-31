import 'package:flutter/material.dart';

class IconsProfile extends StatefulWidget {
  const IconsProfile({Key? key}) : super(key: key);

  @override
  _IconsState createState() => _IconsState();
}

class _IconsState extends State<IconsProfile> {
  @override
  Widget build(BuildContext context) {
    return Padding(
      padding: const EdgeInsets.only(top: 10, bottom: 10),
      child: Row(
        mainAxisAlignment: MainAxisAlignment.spaceAround,
        children: const [
          Icon(
            Icons.accessibility,
            size: 30,
          ),
          Icon(Icons.timer, size: 30),
          Icon(Icons.phone_android, size: 30),
          Icon(Icons.phone_iphone_sharp, size: 30)
        ],
      ),
    );
  }
}
