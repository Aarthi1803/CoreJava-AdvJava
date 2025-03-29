package hello;

class Hello {
	public static void main(String a[]) {
		/*int i=5;// 4 bytes  32 bits  -2147483648 to 2147483647 
		short s=5;//2 bytes  16 bits  -32768 to 32767 
		byte b=5;//1 byte  8 bits  -128 to 127 
		long l=5854l;//8 bytes  64 bits  -9223372036854775808 to 9223372036854775807 
		float f=5.5f;//4 bytes  32 bits  1.4e-45 to 3.4028235e+38 
		double d=5.5;//8 bytes  64 bits  4.9e-324 to 1.7976931348623157e+308 
		char c='a';//2 bytes  16 bits  0 to 65535 
		boolean check=true; //value is either true or false 
		System.out.println( i + " " + s + " " + b + " " + l + " " + f + " " + d + " "+ c + " " + check + " ");
		
		int num1 = 0b101; //output - 5
		int num2 = 0x7E; //output - 126
		int num3 = 10_00_00_000;
		double num4 = 56; //56.0
		double num5 = 12e10;
		char ch = 'a';
		ch++; // char is treated as int also // output - b
		System.out.println( num1 + " " + num2 + " " + num3 + " " + num4 + " " + num5 + " " + ch);*/
		
		/*byte b1 = 127;
		int a1 = 256;
		//b1 = a1; // error
		a1 = b1; // works - implicit conversion (store byte value into int value and becomes integer) smaller items in big box works vice versa doesn't work
		System.out.println( "a1 = " +a1);
		
		byte b2 = 127;
		int a2 = 12;
		b2 = (byte) a2; // casting - explicit conversion
		System.out.println( "b2 = " +b2);
		
		float f = 5.6f;
		int x = (int) f; // output - 5
		System.out.println( "x = " +x);*/
		
		/*byte b3 = 127;
		int a3 = 257;
		b3 = (byte)a3; // error
		System.out.println( "b3 = " +b3);*/
		
		/*byte b4 = 127;
		int a4 = b4; // works - output - 127
		System.out.println( "a4 = " +a4);

		int a5 = 12;
		byte k = (byte) a5; // typecasting
		System.out.println( "k = " +k);

		int a6 = 257;
		byte k1 = (byte) a6; //output - 1 as 257 % 128 = 1 (remainder is 1 as 128*2 = 256)
		System.out.println( "k1 = " +k1);
		
		float f1 = 5.6f;
		//int t = f1;//error
		int t1 = (int) f1; //output - 5
		System.out.println( "t1 = " +t1);
		
		byte a7 = 10;
		byte b6 = 30;
		int result = a7 * b6; // type promotion
		System.out.println( "result = " +result);*/
		
		/*int num1 = 7;
		int num2 = 7;
		num1 = num1 + 1;
		num1 += 1;
		num1++; //post increment - output 8
		++num1; //pre increment - output 8
		num1--; //decrement

		int result1 = ++num1; //output 8 - first increment the value and fetch the value
		int result2 = num2++; //output 7 - first fetch the value and increment
		System.out.println("result = " + result1 + " " + "result1 = " +result2);*/
		
		/*boolean result =(5 < 6)? true : false;
		System.out.println( "result = " +result);
		int n = 7;
		int result1 = 0;
		result1 = n%2==0? 10 : 20;
		System.out.println( "result1 = " +result1);*/
		
		/*int n = 8;
		switch(n){
			case 1:
				System.out.println("Monday");
			case 2:
				System.out.println("Tuesday");
				break;
			case 3:
				System.out.println("Wednesday");
				break;
			case 4:
				System.out.println("Thursday");
				break;
			case 5:
				System.out.println("Friday");
				break;
			case 6:
				System.out.println("Satday");
				break;
			case 7:
				System.out.println("Sunday");
				break;
			default: 
				System.out.println("No day");
		}*/
		
		// Before Java 5 - switch case supported int datatype and not String datatype.
		// After Java 5 - switch case supported both String datatype and int datatype.
		// Below switch case is added after Java 12 version
		
		/*String day = "Sunday";
		String result = "";*/
		//switch(day){
			//Method-1:
			/* case "Saturday", "Sunday":
				System.out.println("6am");
				break;
			case "Monday":
				System.out.println("7am");
				break;
			default:
				System.out.println("8am");*/

			// Method-2:
			/* case "Saturday", "Sunday" -> System.out.println("6am");
			case "Monday" -> System.out.println("7am");
			default -> System.out.println("8am");*/

			// Method-3:
			/*case "Saturday", "Sunday" -> result = "6am";
			case "Monday" -> result = "7am";
			default -> result = "8am";*/
			
			// Method-4:
			//result = switch(day){
			/* case "Saturday", "Sunday" -> "6am";
				case "Monday" -> "7am";
				default -> "8am"; */
			
			// Method-5:
			/*  case "Saturday", "Sunday" : yield "6am";
				case "Monday" : yield "7am";
				default : yield "8am"; */ 
			//};		
		//}
			//System.out.println(result);
		
		/*for (int i=1;i<=5;i++){
			System.out.println("DAY " + i);
			for(int j=1;j<=9;j++){
				System.out.println(" " + (j+8) + "-" + (j+9));
			}
		}*/
		
		/*int i = 1;
		while (i<=4) {
			System.out.println("Hi " + i);
			int j=1;
			while(j<=3) {
				System.out.println("Hello "+ j);
				j++;
			}
			i++;
		}
		System.out.println("Bye " + i);*/
		
		/*int i = 5;
		do{
			System.out.println("Hi " + i);
			i++;
		}while(i<=4);*/
		
		/*int i = 1;
		for(;i<=5;){
			System.out.println("DAY " + i);
			i++;
		}*/
		
	}
}
