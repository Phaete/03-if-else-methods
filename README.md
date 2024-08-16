# 03-If-Else-Methoden

## If-Else

### If-Anweisungen

If-Anweisungen sind Fallunterscheidungen:
- wenn [...], dann [...]

Keyword: _if_ \
\
Syntax:
```java
if (condition) {
    [...]; // Code for true condition
}
```
### Vereinfachen von Bedingungen:
Sei x ein boolean: `boolean x`
- (x == true) vereinfacht zu (x), wenn `x = true`
- (x == false) vereinfacht zu (!x), wenn `x = false`

### If-Else-Anweisungen
- wenn [...], dann [...], sonst [...]

Keywords: _if_, _else_ \
\
Syntax: 
```java
if (condition) {
    [...]; // Code for true condition
} else { 
    [...]; // Code for false condition
}
```
In beiden Fällen: \ 
Die condition muss vom Type _boolean_ sein!

### Nesting
Nesting ist das Verschachteln von (in diesem Falle) if-, bzw if-else-Anweisungen

Beispiel:
```java
if (condition1) {
    if (condition2) {
        if (condition3) {
            [...]; // Code for true condition
        } else { 
            [...]; // Code for false condition
        }
    } else {
        [...]; // Code for false condition
    }
} else {
    if (condition4) {
        [...]; // Code for true condition
    } else { 
        [...]; // Code for false condition
    }
```

# Methoden
Die erste Methode haben wir bereits kennengelernt: _main_ \

### Methodensignatur
`public` `static` `void` `main` `(String[] args)` {}
- `public`: Zugriffsrecht! Wer darf diese Methode nutzen? Später nocht mehr.
- `static`: Später noch mehr dazu.
- `void`: Rückgabewert, void = ohne Rückgabe
- `main`: Methodenname, wie auch bei Variablen: camelCase!
- `(String[] args)`: Übergabeparameter / Argumente

Methoden werden genutzt um Code auszulagern und können somit an verschiedenen Stellen des Codes wiederverwendet werden (Stichwort _Reusability_)

## Scope

Der Scope bezeichnet die Region, in dem zum Beispiel eine Variable zur Verfügung steht. \
Dabei gilt, dass eine Variable, in dem aktuellen, sowie jedem tieferen Codeblock zur Verfügung steht, aber nicht darüber hinaus:
```java
if (condition1) {
    if (condition2) {
        int number = 5;
        if (condition3) {
            int a = 10;
            boolean aGreaterNumber = a > number; // Allowed
        } 
    } else {
        int sum = 2 + number; // Not allowed
    }
}
```

## Rückgabe

Rückgabetyp in Methodensignatur definiert:
`public static void main() {}` -> **void**

Keywords: _return_ \
\
Beispiel:
```
public static int getInteger() {
    return 5;
}
```
Bei Methodenaufruf, wird der Integer _5_ zurückgegeben:
```
int test = getInteger(); // test = 5
```
\
Findet keine Zuweisung statt wird der Rückgabewert "verworfen", bzw ignoriert:
```
getInteger(); // No assignment, return value is ignored
```

## Übergabeparameter / Argumente

Durch Ändern der Methodensignatur können für eine Methode Übergabeparameter, bzw Argumente definiert werden:
```
public static void isLivingOnEarth(boolean livingOnEarth, int age){}
```
Die in diesem Beispiel definierten Argumente sind:
- boolean livingOnEarth
- int age 

Beide sind nun über den jeweiligen Variablennamen innerhalb der Methode zugänglich, müssen aber bei Methodenaufruf **in der korrekten Reihenfolge** übergeben werden:
```
isLivingOnEarth(true, 18);
```
