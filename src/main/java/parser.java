//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------


import tree.*;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\027\000\002\002\003\000\002\002\004\000\002\003" +
    "\005\000\002\003\003\000\002\004\004\000\002\004\003" +
    "\000\002\005\003\000\002\005\003\000\002\005\003\000" +
    "\002\005\003\000\002\010\004\000\002\012\004\000\002" +
    "\011\004\000\002\006\003\000\002\006\003\000\002\006" +
    "\003\000\002\007\005\000\002\013\005\000\002\014\003" +
    "\000\002\014\004\000\002\015\003\000\002\015\003\000" +
    "\002\016\005" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\037\000\010\005\015\007\011\015\020\001\002\000" +
    "\016\002\ufffe\005\015\007\011\010\ufffe\014\ufffe\015\020" +
    "\001\002\000\016\002\ufffb\005\ufffb\007\ufffb\010\ufffb\014" +
    "\ufffb\015\ufffb\001\002\000\016\002\ufffa\005\ufffa\007\ufffa" +
    "\010\ufffa\014\ufffa\015\ufffa\001\002\000\006\002\001\014" +
    "\037\001\002\000\016\002\ufffc\005\ufffc\007\ufffc\010\ufffc" +
    "\014\ufffc\015\ufffc\001\002\000\010\005\015\007\011\015" +
    "\020\001\002\000\016\002\ufff9\005\ufff9\007\ufff9\010\ufff9" +
    "\014\ufff9\015\ufff9\001\002\000\024\002\ufff2\005\ufff2\007" +
    "\ufff2\010\ufff2\011\ufff2\012\ufff2\013\ufff2\014\ufff2\015\ufff2" +
    "\001\002\000\004\002\034\001\002\000\004\015\027\001" +
    "\002\000\024\002\ufff4\005\ufff4\007\ufff4\010\ufff4\011\ufff4" +
    "\012\ufff4\013\ufff4\014\ufff4\015\ufff4\001\002\000\024\002" +
    "\ufff8\005\ufff8\007\ufff8\010\ufff8\011\021\012\022\013\023" +
    "\014\ufff8\015\ufff8\001\002\000\024\002\ufff3\005\ufff3\007" +
    "\ufff3\010\ufff3\011\ufff3\012\ufff3\013\ufff3\014\ufff3\015\ufff3" +
    "\001\002\000\016\002\ufff5\005\ufff5\007\ufff5\010\ufff5\014" +
    "\ufff5\015\ufff5\001\002\000\016\002\ufff7\005\ufff7\007\ufff7" +
    "\010\ufff7\014\ufff7\015\ufff7\001\002\000\016\002\ufff6\005" +
    "\ufff6\007\ufff6\010\ufff6\014\ufff6\015\ufff6\001\002\000\006" +
    "\006\uffed\015\uffed\001\002\000\004\006\033\001\002\000" +
    "\006\006\uffef\015\027\001\002\000\010\004\030\006\uffec" +
    "\015\uffec\001\002\000\004\015\031\001\002\000\006\006" +
    "\uffeb\015\uffeb\001\002\000\004\006\uffee\001\002\000\024" +
    "\002\ufff0\005\ufff0\007\ufff0\010\ufff0\011\ufff0\012\ufff0\013" +
    "\ufff0\014\ufff0\015\ufff0\001\002\000\004\002\000\001\002" +
    "\000\006\010\036\014\037\001\002\000\024\002\ufff1\005" +
    "\ufff1\007\ufff1\010\ufff1\011\ufff1\012\ufff1\013\ufff1\014\ufff1" +
    "\015\ufff1\001\002\000\010\005\015\007\011\015\020\001" +
    "\002\000\016\002\uffff\005\015\007\011\010\uffff\014\uffff" +
    "\015\020\001\002\000\016\002\ufffd\005\ufffd\007\ufffd\010" +
    "\ufffd\014\ufffd\015\ufffd\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\037\000\026\002\013\003\006\004\003\005\007\006" +
    "\016\007\015\010\004\011\011\012\005\013\012\001\001" +
    "\000\020\005\040\006\016\007\015\010\004\011\011\012" +
    "\005\013\012\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\024\003\034\004" +
    "\003\005\007\006\016\007\015\010\004\011\011\012\005" +
    "\013\012\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\010\014\024\015\025\016\023\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\010\014\031\015\025\016" +
    "\023\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\022\004\037" +
    "\005\007\006\016\007\015\010\004\011\011\012\005\013" +
    "\012\001\001\000\020\005\040\006\016\007\015\010\004" +
    "\011\011\012\005\013\012\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}


  /** User initialization code. */
  public void user_init() throws java.lang.Exception
    {
  
    }

  /** Scan to get the next Symbol. */
  public java_cup.runtime.Symbol scan()
    throws java.lang.Exception
    {
   return getScanner().next_token(); 
    }



    Node root;
    public Node getRoot()
    {
        return root;
    }



/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$parser$actions {
  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$parser$do_action_part00000000(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // all ::= union 
            {
              Node RESULT =null;
		int uleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int uright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Node u = (Node)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
		Node end = new Hash();
		RESULT = new AndNode(u, end);
		root = RESULT;
	
              CUP$parser$result = parser.getSymbolFactory().newSymbol("all",0, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= all EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Node start_val = (Node)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // union ::= union BAR concatenation 
            {
              Node RESULT =null;
		int uleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int uright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Node u = (Node)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int cleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int cright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Node c = (Node)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
        RESULT = new OrNode(u, c);
    
              CUP$parser$result = parser.getSymbolFactory().newSymbol("union",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // union ::= concatenation 
            {
              Node RESULT =null;
		int cleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int cright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Node c = (Node)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
        RESULT = c;
    
              CUP$parser$result = parser.getSymbolFactory().newSymbol("union",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // concatenation ::= concatenation basic_RE 
            {
              Node RESULT =null;
		int cleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int cright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Node c = (Node)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int breleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int breright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Node bre = (Node)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
        RESULT = new AndNode(c, bre);
    
              CUP$parser$result = parser.getSymbolFactory().newSymbol("concatenation",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // concatenation ::= basic_RE 
            {
              Node RESULT =null;
		int breleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int breright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Node bre = (Node)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
        RESULT = bre;
    
              CUP$parser$result = parser.getSymbolFactory().newSymbol("concatenation",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // basic_RE ::= star 
            {
              Node RESULT =null;
		int sleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int sright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Node s = (Node)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
	    RESULT = s;
	
              CUP$parser$result = parser.getSymbolFactory().newSymbol("basic_RE",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // basic_RE ::= plus 
            {
              Node RESULT =null;
		int pleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int pright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Node p = (Node)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
		RESULT = p;
	
              CUP$parser$result = parser.getSymbolFactory().newSymbol("basic_RE",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // basic_RE ::= question_mark 
            {
              Node RESULT =null;
		int qleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int qright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Node q = (Node)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
    	RESULT = q;
    
              CUP$parser$result = parser.getSymbolFactory().newSymbol("basic_RE",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // basic_RE ::= elementary_RE 
            {
              Node RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Node e = (Node)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
		RESULT = e;
	
              CUP$parser$result = parser.getSymbolFactory().newSymbol("basic_RE",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // star ::= elementary_RE STAR 
            {
              Node RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Node e = (Node)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		
		RESULT = new StarNode(e);
	
              CUP$parser$result = parser.getSymbolFactory().newSymbol("star",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // plus ::= elementary_RE PLUS 
            {
              Node RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Node e = (Node)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		
		RESULT = new PlusNode(e);
	
              CUP$parser$result = parser.getSymbolFactory().newSymbol("plus",8, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // question_mark ::= elementary_RE QUESTION_MARK 
            {
              Node RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Node e = (Node)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		
		RESULT = new OrNode(e);
	
              CUP$parser$result = parser.getSymbolFactory().newSymbol("question_mark",7, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // elementary_RE ::= group 
            {
              Node RESULT =null;
		int gleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int gright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Node g = (Node)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
	    RESULT = g;
	
              CUP$parser$result = parser.getSymbolFactory().newSymbol("elementary_RE",4, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // elementary_RE ::= CHAR 
            {
              Node RESULT =null;
		int cleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int cright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Character c = (Character)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
		RESULT = new SymbolNode(c);
	
              CUP$parser$result = parser.getSymbolFactory().newSymbol("elementary_RE",4, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // elementary_RE ::= set 
            {
              Node RESULT =null;
		int sleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int sright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Node s = (Node)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
		RESULT = s;
	
              CUP$parser$result = parser.getSymbolFactory().newSymbol("elementary_RE",4, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // group ::= LEFT_BRACKET union RIGHT_BRACKET 
            {
              Node RESULT =null;
		int uleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int uright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Node u = (Node)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		
		RESULT = u;
	
              CUP$parser$result = parser.getSymbolFactory().newSymbol("group",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // set ::= LEFT_SQUARE_BRACKET series RIGHT_SQUARE_BRACKET 
            {
              Node RESULT =null;
		int sleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int sright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Node s = (Node)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		
		RESULT = s;
	
              CUP$parser$result = parser.getSymbolFactory().newSymbol("set",9, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // series ::= element 
            {
              Node RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Node e = (Node)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
		RESULT = e;
	
              CUP$parser$result = parser.getSymbolFactory().newSymbol("series",10, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // series ::= element series 
            {
              Node RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Node e = (Node)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int sleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int sright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Node s = (Node)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
		RESULT = new OrNode(e, s);
	
              CUP$parser$result = parser.getSymbolFactory().newSymbol("series",10, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // element ::= range 
            {
              Node RESULT =null;
		int rleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int rright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Node r = (Node)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
		RESULT = r;
	
              CUP$parser$result = parser.getSymbolFactory().newSymbol("element",11, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // element ::= CHAR 
            {
              Node RESULT =null;
		int cleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int cright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Character c = (Character)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
		RESULT = new SymbolNode(c);
	
              CUP$parser$result = parser.getSymbolFactory().newSymbol("element",11, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // range ::= CHAR DASH CHAR 
            {
              Node RESULT =null;
		int char1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int char1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Character char1 = (Character)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int char2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int char2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Character char2 = (Character)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
		RESULT = new OrNode(char1, char2);
	
              CUP$parser$result = parser.getSymbolFactory().newSymbol("range",12, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
              return CUP$parser$do_action_part00000000(
                               CUP$parser$act_num,
                               CUP$parser$parser,
                               CUP$parser$stack,
                               CUP$parser$top);
    }
}

}
