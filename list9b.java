//// Exercise #9b
String title=  "Exercise 9b:  array of integers (sith swap & sort)";
String help=  "Press key with first letter of a function ('?' for help; 'q' to quit)";
String author=  "Your Name";

int[] z=  { 999, 44, 1234, 42, 595, 666, 13, 55, 710, 6, 33 };
int many=  z.length;

void setup() {
  size( 500,400 );
}

void draw() {
  background( 100,220,250 );
  if (keyPressed && key == '?') { help(); return; }
  fill( 150, 0, 0 );
  textSize(16);
  int next=18;
  // Display the numbers.
  float x=50, y=50;
  for (int j=0; j<many; j++) {
    text( z[j], x, y );
    y += next;              // next line
  }
  //// Skip a line and display total and average
  y += next;
  int total=  sum( z, many );
  float avg=  float(total) / many;  
  text( "The total is:      "+total, 100, y );
  y += next;
  text( "The average is:  "+avg, 100, y );
  //// Title, etc..
  textSize(20);
  text( title, width/4, 20 );
  textSize(12);
  text( help, width/4, 40 );
  text( author, 20, height-20 );
}
void help() {
  String s="";
  s += "\n  r    randomize";
  s += "\n  b    big";
  s += "\n  s    small";
  s += "\n  o    order";
  s += "\n";
  s += "\n  i    inc";
  s += "\n  d    dec";
  s += "\n  t    triple";
  s += "\n  q    quit";


  text( s, 50, 50 );
}

//// Return the sum total ////
int sum( int a[], int m ) {
  int result=0;
  for (int j=0; j<m; j++ ) {
    result += a[j];
  }
  return result;
}

void keyPressed() {
  if (key == 'q') exit();
  else if (key == 'b') big( z, many );
  else if (key == 's') small( z, many );
  else if (key == 'o') order( z, many );
  //  
  else if (key == 'i') inc( z, many );
  else if (key == 'd') dec( z, many );
  else if (key == 't') triple( z, many );
  //
  else if (key == 'r') randomize( z, many );
  else if (key == '?') help();
  else text( "NO SUCH FUNCTION:  "+key, width/2, height/2 );
}

void big( int a[], int m ) {
  // Move the biggest number to the end of the array. 
  // (Swap array elements, to keep all of the numbers.)
  int w=0;
  for (int j=1; j<m; j++) {
    if (a[j] > a[w]) w=j;
  }
  swap( a, w, m-1 );
}
void swap( int p[], int a, int b ) {
  //// exchange p[a] with p[b]
  int tmp=  p[a];
  p[a]=  p[b];
  p[b]=  tmp;
}

void small( int a[], int m ) {
  // Move the smallest number to the beginning of the array 
  // (Swap, to keep all numbers.)
  int w=0;
  for (int j=1; j<m; j++) {
    if (a[j] < a[w]) w=j;
  }
  swap( a, w, 0 );
}

void inc( int a[], int m ) {
  // Increase each of the numbers by one.
  for (int j=0; j<m; j++) {
    a[j]++;
  }
}

void dec( int a[], int m ) {
  // Decrease each of the numbers by one.
 for (int j=0; j<m; j++) {
    a[j]--;
  }
}

void triple( int a[], int m ) {
  // Triple each ofthe numbers.
 for (int j=0; j<m; j++) {
    a[j] *= 3;
  }
}
void randomize( int a[], int m ) {
  // Replace all numbers of random values.
 for (int j=0; j<m; j++) {
    a[j]=  int( random( 0, 1000 ) );
  }
}

// Sort entire array. //
void order( int q[], int m ) {
  for (int k=m; k>1; k--) {
    big( q, k );
  }
}

