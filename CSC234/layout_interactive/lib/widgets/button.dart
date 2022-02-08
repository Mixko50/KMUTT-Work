import 'package:flutter/material.dart';

class ButtonClick extends StatelessWidget {
  const ButtonClick({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Row(
      mainAxisAlignment: MainAxisAlignment.spaceEvenly,
      children: [
        _buildIconButton(Icons.call, "063-888-9999", context),
        _buildIconButton(Icons.near_me, "Route", context),
        _buildIconButton(Icons.share, "Share", context)
      ],
    );
  }

  Widget _buildIconButton(IconData icon, String text, BuildContext context) {
    return Padding(
      padding: const EdgeInsets.only(bottom: 20),
      child: InkWell(
        child: SizedBox(
          width: 130,
          child: Column(children: [
            Icon(
              icon,
              color: Colors.pink[300],
              size: 26,
            ),
            Text(
              text,
              style: TextStyle(color: Colors.pink[300], fontSize: 16),
            )
          ]),
        ),
        onTap: () {},
      ),
    );
  }
}
