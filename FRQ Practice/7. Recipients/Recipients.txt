/*
Implement three methods for processing names and addresses from a mailing list.A Recipients class will be used as part of this system. The lines in the mailing list are stored in an ArrayList<String>, a private instance variable in the Recipients class. The blank line that separates recipients in the mailing list is stored as an empty string in this list, and the final element in the list is an empty string.

A portion of the mailing list is shown below, with the corresponding part of the ArrayList:

Mr. J. Adams
6 Rose St.
Ithaca, NY 14850

Jack S. Smith
12 Posy Way
Suite 2A
Glendale, CA 91203

Ms. M.K. Delgado
2 River Dr.
New York, NY 10013

     . . .

        0               1                 2            3          4
-----------------------------------------------------------------------------
| "Mr. J. Adams" | "6 Rose St." | "Ithaca, NY 14850" | "" | "Jack S. Smith" |
-----------------------------------------------------------------------------

        5             6                   7           8             9
-------------------------------------------------------------------------------
| "12 Posy Way" | "Suite 2A" | "Glendale, CA 91203" | "" | "Ms. M.K. Delgado" |
-------------------------------------------------------------------------------

        10                  11           12
-------------------------------------------------
| "2 River Dr." | "New York, NY 10013" | "" |     . . .
-------------------------------------------------

*/

public class Recipients {
  // The Recipients class processes this data.


private List<String> lines;
  // The list of lines in the mailing list
 
public Recipients()
{ /* implementation not shown */ }
  /*
  Constructor.
  Fill lines with mailing list data.
  Each element in lines is one line of the mailing list.
  Lines in the list are in the same order that they appear in the mailing list.
  Blank line separators in the mailing list are stored as empty strings.
  */

public String extractCity(String cityZip) 
  { /* your code here */ }
  /*
  cityZip contains the city, state, and zipcode line of an address.
  Returns the city contained in the cityZip string of an address.
  */

public void printNames()
  { /* your code here */ }
  /*
  The recipient name is the first line of each label on the mailing list.
  Prints a list of recipient names to the console, one per line.
  */

public String getAddress(String name)
  { /* your code here */ }
  /*
  name is a name in the lines ArrayList.
  Returns the address of the recipient with the given name.
  For example, if name is "Jack S. Smith", a string containing the three subsequent lines of his address should be returned. This string should contain line breaks in appropriate places, including after the last line of the address. This ensures that the address will have the proper address format when printed by a client class.
  */

// Other methods not shown.
