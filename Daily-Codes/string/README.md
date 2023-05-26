## Strings
#### "In Java, string is basically an object that represents sequence of char values. An array of characters works same as Java string."

### Ways to Initialise a string

### Using String Literal
```java
String s = "INPUT";
//Using the new keyword
String s = new String("INPUT");
//From a given character array
char ch[]={'I','N','P','U','T'};    
String s=new String(ch);   
```

## String Methods

| Command                    | Description                        |
| -------------------------- | ---------------------------------- |
| length                     | length of string                   |
| charAt(_i_)                | extract \_i_th character           |
| subst­ring(_start_, _end_) | substring from _start_ to _end_-1  |
| toUpp­erC­ase()            | returns copy of _s_ in ALL CAPS    |
| toLow­erC­ase()            | returns copy of _s_ in lowercase   |
| indexOf(_x_)               | index of first occurence of _x_    |
| replace(_old_, _new_)      | search and replace                 |
| split(_regex_)             | splits string into tokens          |
| trim()                     | trims surrou­nding whitespace      |
| equals(_s2_)               | true if s equals s2                |
| compa­reTo(_s2_)           | 0 if equal/+ if s > s2/- if s < s2 |

