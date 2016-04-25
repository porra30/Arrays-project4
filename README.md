# Array exercises

<HTML>
<BODY BGCOLOR=#FFCC99>
<H2 ALIGN=CENTER> Array of integers </H2>

<P>
Create an array of integers, and display them in a list.
<P>
Write a function to add up all of the numbers in an array and return the total.
<BR>
Display the sum total and mean average.

<IMG SRC=p9.png ALIGN=RIGHT WIDTH=300>

<BR>
<B>NOTE:</B>
&nbsp;
<I>Mean average is total divided by size of array.
Since this could be a fraction, be sure to make it a "float".
</I>

<H3><U>
Add some functions to do the following:
</U></H3>

<UL>
<DL>

<P><DT> <BIG><B><TT>big( int a[], int m )</TT></B></BIG>
	<DD> // Move biggest number to end of the array.
	<BR><I>// (Swap array elements, to keep all numbers.)</I>

<P><DT> <BIG><B><TT>small( int b[], int m )</TT></B></BIG>
	<DD> // Move smallest to beginning of array
	<BR><I> // (Swap, to keep all numbers.)</I>

<P><DT> <BIG><B><TT>inc( int d[], int n )</TT></B></BIG>
	<DD> // Increase each of the numbers by one.

<P><DT> <BIG><B><TT>dec( int a[], int m )</TT></B></BIG>
	<DD> // Decrease each of the numbers by one.

<P><DT> <BIG><B><TT>triple( int a[], int m )</TT></B></BIG>
	<DD> // Triple each of the numbers.

<P><DT> <BIG><B><TT>randomize( int p[], int k )</TT></B></BIG>
	<DD> // Replace all numbers of random values.

</DL>
</UL>

<FONT COLOR=RED>
<B>
<BIG>
<U>NOTE:</U>  &nbsp;&nbsp;
Do not use global values in these functions; use the arguments.
</FONT>
</BIG>
</B>

<HR>

<P><DT><BIG><B><U>Write code in 
<BIG><TT>keyPressed()</TT></BIG>
</BIG>
</U></B>
	<DD> to call each function when a key is pressed,
	<NOBR>
	with the first letter of that function.
	</NOBR>

<TABLE ALIGN=CENTER BGCOLOR=#99CCFF><TR><TD><PRE>

    b	big()		// Move biggest to end of array.
    s	small()		// Move smallest to beginning.
    i	inc()		// Increase each by one.
    d	dec()		// Decrease each by one.
    t	triple()	// Triple each ofthe numbers.
    r	randomize()	// Replace all with random values.

</TABLE>

<HR>
<P><DT><BIG><B><U>BUTTONS</U></B></BIG> 
	<DD>
	create buttons with the names these mwthods,
	<BR>
	and add 
	<B><BIG><TT>mousePressed()</TT></BIG></B>
	code to call them when button is pressed.
	</U></B>

