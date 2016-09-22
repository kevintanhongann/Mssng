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

results = db.child("persons").child("Besant Singh").push(data, user['idToken'])