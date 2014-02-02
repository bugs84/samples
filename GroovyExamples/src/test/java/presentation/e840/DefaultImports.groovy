//lze vynechat i definice package

import java.awt.BorderLayout

//Defaultní importy základních balíků
//java.lang, java.util, java.io, java.net

//java.lang
assert 2 == Math.max(1, 2)

//java.util
assert 10 > new Random().nextInt(10)

//java.io
assert "Name.txt" == new File("c:/Name.txt").name

//java.net
assert InetAddress.getByName("127.0.0.1").loopbackAddress

//Ostatní balíky se normálně importují
assert "North" == BorderLayout.NORTH