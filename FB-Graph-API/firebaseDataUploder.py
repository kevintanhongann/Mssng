import pyrebase

config = {
  "apiKey": "AIzaSyBGji4RqyJ2Lj5jxF3xWVDKEhIc7-SlOvQ",
  "authDomain": "mssng-16afe.firebaseapp.com",
  "databaseURL": "https://mssng-16afe.firebaseio.com",
  "storageBucket": "mssng-16afe.appspot.com"
}

firebase = pyrebase.initialize_app(config)

# Get a reference to the auth service
auth = firebase.auth()
user = auth.sign_in_with_email_and_password("abdhay818@gmail.com", "abc123")

db = firebase.database()
#db.child("persons").child("Abidin")

##
# private String status; - missing or found
# private String firstname;
# private String lastname;
# private String nickname;
# private Date lastSeen;
# private String sex; - male or female 
# private Date created;
# private Date updated;
# private float height;
# private float weight;
# private List<String> imageUrls;
# private Double latitude;
# Private Double longitude;



##
data = {"status": "Missing", 
        "firstname": "Besant Singh",
        "lastname": "A/L Kanaiah Singh",
        "nickname": "Besant",
        "lastSeen": "12/02/2007",
        "sex":"male",
        "created": "12/02/2007",
        "updated": "25/03/2007",
        "height": "180cm",
        "weight": "70kg",
        "imageUrls":"http://www.rmp.gov.my/filebase/picture/oh/000041_07_39342.6072061227.jpg",
        "latitude": "3.157279",
        "longitude": "101.716010"}



#db.child("persons").push(data)
#db.child("persons").child("Besant Singh")

results = db.child("persons").push(data, user['idToken'])

data2 = {"status": "Missing", 
        "firstname": "Cheh Pui Kit",
        "lastname": "",
        "nickname": "Ah Pui",
        "lastSeen": "09/03/2009",
        "sex":"male",
        "created": "12/03/2009",
        "updated": "15/03/2009",
        "height": "155cm",
        "weight": "55kg",
        "imageUrls":"http://www.rmp.gov.my/filebase/picture/oh/00064_09_200903291200006459.jpg",
        "latitude": "3.157279",
        "longitude": "101.716010"}

results = db.child("persons").push(data2, user['idToken'])

#####
data3 = {"status": "Missing", 
        "firstname": "Rosliana",
        "lastname": "Ramli",
        "nickname": "Ros",
        "lastSeen": "24/01/2007",
        "sex":"female",
        "created": "27/01/2007",
        "updated": "28/01/2007",
        "height": "135cm",
        "weight": "49kg",
        "imageUrls":"http://www.rmp.gov.my/filebase/picture/oh/00008_07_39164.6054596991.jpg",
        "latitude": "3.157279",
        "longitude": "101.716010"}

results = db.child("persons").push(data3, user['idToken'])
######

#####
data4 = {"status": "Missing", 
        "firstname": "Nurul Asyiqin",
        "lastname": "Salleh",
        "nickname": "Nurul",
        "lastSeen": "24/02/2012",
        "sex":"female",
        "created": "25/02/2012",
        "updated": "28/02/2012",
        "height": "145cm",
        "weight": "52kg",
        "imageUrls":"http://www.rmp.gov.my/filebase/picture/oh/2_201200221200006274.jpg",
        "latitude": "3.157279",
        "longitude": "101.716010"}

results = db.child("persons").push(data4, user['idToken'])
######

#####
data5 = {"status": "Missing", 
        "firstname": "NG YEN NEE",
        "lastname": "",
        "nickname": "NG YEN NEE",
        "lastSeen": "15/10/2012",
        "sex":"female",
        "created": "18/10/2012",
        "updated": "28/11/2012",
        "height": "165cm",
        "weight": "55kg",
        "imageUrls":"http://www.rmp.gov.my/filebase/picture/oh/63_201333151200004984.JPG",
        "latitude": "3.157279",
        "longitude": "101.716010"}

results = db.child("persons").push(data5, user['idToken'])
######