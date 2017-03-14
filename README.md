# jsonfour
**pre-req [ java 1.8 ]**
parse x delimited string into json format [ i.e. large college list to json format ]
data list create/download from [nces.ed.gov/ipeds/datacenter](https://nces.ed.gov/ipeds/datacenter/InstitutionList.aspx)

# function example :
**demoData.uid** -> in : [ 
```
101161|James H Faulkner State Community College|Bay Minette|AL
101295|George C Wallace State Community College-Hanceville|Hanceville|AL
101365|Herzing University-Birmingham|Birmingham|AL
```
out -> **output.json** :
```
[{"id":"101161","name":"James H Faulkner State Community College","city":"Bay Minette","state":"AL"},{"id":"101295","name":"George C Wallace State Community College-Hanceville","city":"Hanceville","state":"AL"},{"id":"101365","name":"Herzing University-Birmingham","city":"Birmingham","state":"AL"}]
```
formatted :
```
[{
"id":"101161",
"name":"James H Faulkner State Community College",
"city":"Bay Minette",
"state":"AL"
},{
"id":"101295",
"name":"George C Wallace State Community College-Hanceville",
"city":"Hanceville",
"state":"AL"
},{
"id":"101365",
"name":"Herzing University-Birmingham",
"city":"Birmingham",
"state":"AL"
}]
```

# quickrun / data modification :
- clone git repo
```
git clone https://github.com/devstackio/jsonfour
```
- enter root directory & download dependencies
```
cd jsonfour
```
- make sure data file and output file names are correct [and live in root directory]
```
com.devstackio.parsers.jsonfour
...
public class App {
    
    private static final String FILENAME = "demoData.uid";
    private static final String OUTPUT_FILENAME = "output.json";
```
- compile any modifications made
```
mvn clean install
```
- run main class to output to **OUTPUT_FILENAME**
```
mvn exec:java -Dexec.mainClass="com.devstackio.parsers.jsonfour.App"
```