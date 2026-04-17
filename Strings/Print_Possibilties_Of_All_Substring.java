package Strings;

public class Print_Possibilties_Of_All_Substring {
	static void printSubStr(String s) {
		for (int i = 0; i < s.length(); i++) {
			for (int j = i; j < s.length(); j++) {
				System.out.println(s.substring(i, j + 1));
			}
			System.out.println("-".repeat(20));
		}

	}

	public static void main(String[] args) {
		printSubStr("THAILAND");

	}

}
/*
T
TH
THA
THAI
THAIL
THAILA
THAILAN
THAILAND
--------------------
H
HA
HAI
HAIL
HAILA
HAILAN
HAILAND
--------------------
A
AI
AIL
AILA
AILAN
AILAND
--------------------
I
IL
ILA
ILAN
ILAND
--------------------
L
LA
LAN
LAND
--------------------
A
AN
AND
--------------------
N
ND
--------------------
D
--------------------
*/