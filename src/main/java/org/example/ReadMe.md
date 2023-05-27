path is an interface using sum method it's provide acutal 
location in file system since it's an interface we cant make form it and object 
so we have an factory class name of it paths it has tow method one take 

Paths.get(string path , String more )
paths.get(uri uri)
a uri is stand for uniform resources idinifir and is has some schema 

file + absualte path or fttp https http 


the path inteface has some method first 

path.getParent 

path.getFileName

path.getNameCount

path.getRoot
path.toUri
path.toRealPath it trow io exception 

common optinal lne using in io 


first 

NOFOLLOW_LINKE the sympol line not tracversal
FOLLOW_LINKE
REPLACE_EXSSIT
ATOMIC_MOVE


*****






| method	             | isThrowException  	 | type	                          |   	|   	|
|---------------------|---------------------|--------------------------------|---	|---	|
| 	   move            | 	     yes           | 	   Io                         |   	|   	|
| 	 delete            | 	          yes      | 	  FileNotFoundException       |   	|   	|
| 	  delete           | 	    yes            | 	   DirectoryNotEmptyException |   	|   	|
| 	isSympoleLinke     | 	    no             | 	                              |   	|   	|
| 	       isDirectody | 	    no             | 	                              |   	|   	|
| 	             copy  | 	 yes               | 	  Io                          |   	|   	|
| 	   | 	                | 	    |   	|   	|

