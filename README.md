## Projekt für den Kurs "Werkzeugunterstützte Software Entwicklung"

English version available below.

### Rahmen des Projekts
------------------
Dieses Projekt war für die Einführung in Werkzeugunterstützte Softwareentwicklung gedacht. Dabei war uns Studierenden freigestellt in welchem Projekt die Werkzeuge zum Einsatz kommen. In diesem Projekt habe ich Folgende Werkzeuge benutzt:
 - Eclipse
 - Git
 - Maven
 - Maven Unit Tests / JUnit
 - Jenkins
 - Doxygen

### Inhalt
-----------------
Ich habe mir überlegt, eine Klassenhierarchie zu entwickeln, mit der Basiseinheiten als Klassen erstellt werden können, wie z.B. Distanz: Meter, Zentimeter; Zeit: Stunde,Sekunde. Diese Basiseinheiten stellen Funktionen bereit, sich mit anderen Basiseinheiten addieren zu können. Somit sollte eine "Meter" Klasse nicht mit einer "Stunde" Klasse addierbar sein. Dies habe ich über eine dreistufige Typisierungshierarchie gelöst:

Deklaration einer Einheit:
```Java
public class Meter extends A_distance<Meter> {…}
```
Deklaration einer einheitenspezifischen Klasse:
```Java
public abstract class A_distance<T extends A_distance> extends BaseUnit<T,A_distance> {…}
```
Deklaration der Basiseinheitenklasse:
```Java
public abstract class BaseUnit<T extends F, F extends BaseUnit> {
  public T plus(F toAdd) {…}
}
```

Des weiteren gibt es Einheiten, die durch die Kombination der Basiseinheiten entstehen, wie z.B. km/h. Diese wurden durch die ["Units"](./src/com/WUSE/Units/Unit.java) Klasse implementiert. 

### Benutzung
-------
Die ["HelloWorld"](./src/helloWorld/HelloWorld.java) Klasse zeigt Beispiele zur Benutzung auf.

### Fazit
-------
In diesem Projekt konnte ich viel über extreme Abhängigkeiten in Java inclusive der Benutzung von unbounded Wildcards (Klasse ["Units"](./src/com/WUSE/Units/Unit.java)) erfahren.



## Project for the course "Tool Assisted Software Development"

### Scope des Projekts
------------------
This project was for showing Tool Assisted Software Development on a hands on project. We studends were allowed to use any project and tools for this course. I chose following tools:
 - Eclipse
 - Git
 - Maven
 - Maven Unit Tests / JUnit
 - Jenkins
 - Doxygen

### Contend
-----------------
I chose to use a class hirarchie to create base units as classes, like distance: meter, centimeter; time: hour, second. Those base units provide funktionality to interact with base units of the same kind. Therefore a "meter" should not be, for example addable to an hour. I managed to do this via a three staged type hirarchie.

Declaration of a specific unit:
```Java
public class Meter extends A_distance<Meter> {…}
```
Declaration of a specific unit class:
```Java
public abstract class A_distance<T extends A_distance> extends BaseUnit<T,A_distance> {…}
```
Declaration of the base unit:
```Java
public abstract class BaseUnit<T extends F, F extends BaseUnit> {
  public T plus(F toAdd) {…}
}
```

Furthermore there are Units, that can be created through combining base units, for example km/h. This Funktion is Provided through the class ["Units"](./src/com/WUSE/Units/Unit.java).

### Benutzung
-------
The ["HelloWorld"](./src/helloWorld/HelloWorld.java) class shows usage examples.

### Fazit
-------
In this project I clould learn a lot about extreme Dependencies including the usage of unbounded wildcards (class ["Units"](./src/com/WUSE/Units/Unit.java)).




