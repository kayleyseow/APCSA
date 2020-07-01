// (a)
public String extractCity(String cityZip) {
	int commaPos = cityZip.indexOf(",");
	return cityZip.substring(0, commaPos);
}

(b)
public void printNames() {
	System.out.println(lines.get(0));
	int index = 1;
	while(index < lines.size() - 1) {
		if (lines.get(index).equals("")) System.out.println(lines.get(index + 1));
	index++;
	}
}

(c)
public String getAddress(String name) {
	int index = 0;
	while(index < lines.size() && !name.equals(lines.get(index))) index++;
    index++;
	String s = "";
	while (!(lines.get(index).equals(""))) {
		s += lines.get(index) + "\n";
		index++;
	}
	return s;
}

/*
In part (b), the empty string signals that the next element in the list will be a name. You need to be careful that you don’t miss the first name in the list, which is at index 0. You can avoid the empty string at the end of the list by having index < lines.size() - 1 as the test in the while loop. If you don’t do this, the final lines.get(index + 1) will cause an IndexOutOfBounds Exception.

Part(c) first finds the name that matches the parameter, and then builds a string out of the next two or three lines that comprise the address. Again, the empty string signals that the end of the address has been reached.

The escape character string,"\n",inserts a line break into the string.
*/