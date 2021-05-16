# noaa_2017_version_1

The CSV file that is used is shorten as GitHub does not allow more than 100 MB to be uploaded. 

To use, simply replace the 2017.csv file (noaa_2017_version_1\src\main\java\com\example\noaa_2017_version_1\2017.csv) with the csv file:
ftp://ftp.ncdc.noaa.gov/pub/data/ghcn/daily/by_year/2017.csv.gz

1) To use the API, simply run the Java Spring Boot program in your IDE
2) Go on browser and go to http://localhost:8080/station?id=ID_HERE
3) ID_HERE from step 2 is the ID you would want to look up the data from.
Example: http://localhost:8080/station?id=AEM00041194 . This will give you a JSON like this: [{"id":"AEM00041194","yearMonthDay":"20170101","element":"PRCP","value":"0","mFlag":"","qFlag":"","sFlag":"S","xFlag":""},{"id":"AEM00041194","yearMonthDay":"20170101","element":"TAVG","value":"223","mFlag":"H","qFlag":"","sFlag":"S","xFlag":""}]
