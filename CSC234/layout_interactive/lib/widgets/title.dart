import 'package:flutter/material.dart';

class TitleName extends StatefulWidget {
  const TitleName({Key? key}) : super(key: key);

  @override
  _TitleNameState createState() => _TitleNameState();
}

class _TitleNameState extends State<TitleName> {
  int count = 0;
  @override
  Widget build(BuildContext context) {
    return Container(
      padding: const EdgeInsets.only(left: 40, right: 40, top: 20, bottom: 20),
      child: Row(
        mainAxisAlignment: MainAxisAlignment.spaceBetween,
        children: [
          Column(crossAxisAlignment: CrossAxisAlignment.start, children: [
            const Text(
              "Apisit Maneerat",
              style: TextStyle(fontWeight: FontWeight.bold, fontSize: 16),
            ),
            Text(
              "CS KMUTT",
              style: TextStyle(color: Colors.grey[500], fontSize: 16),
            ),
          ]),
          Row(
            children: [
              InkWell(
                child: Icon(
                  Icons.person,
                  color: Colors.pink[500],
                  size: 28,
                ),
                onTap: () {
                  setState(() {
                    count += 1;
                  });
                },
              ),
              Text(
                count.toString(),
                style: const TextStyle(fontSize: 16),
              )
            ],
          )
        ],
      ),
    );
  }
}
