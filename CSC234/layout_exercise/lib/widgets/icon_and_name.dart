import 'package:flutter/material.dart';

class IconAndName extends StatelessWidget {
  final String name;
  final String position;

  const IconAndName({Key? key, required this.name, required this.position})
      : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Row(
      children: [
        const Padding(
            padding: EdgeInsets.all(12.0),
            child: Icon(
              Icons.account_circle,
              size: 70,
            )),
        Column(
          crossAxisAlignment: CrossAxisAlignment.start,
          children: [
            Text(name,
                style:
                    const TextStyle(fontSize: 20, fontWeight: FontWeight.w600)),
            Text(
              position,
              style: const TextStyle(fontSize: 17),
            )
          ],
        )
      ],
    );
  }
}
