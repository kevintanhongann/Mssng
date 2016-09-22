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
        "firstname": "Abidin",
        "lastname": "Zulkarnain",
        "nickname": "none",
        "lastSeen": "02/03/2002",
        "sex":"male",
        "created": "05/03/2002",
        "updated": "08/03/2002",
        "height": "160cm",
        "weight": "65kg",
        "imageUrls":"http://www.rmp.gov.my/filebase/picture/oh/24_39700.5188885185.jpg",
        "latitude": "3.157279",
        "longitude": "101.716010"}



#db.child("persons").push(data)

results = db.child("persons").child("Abidin").update(data, user['idToken'])