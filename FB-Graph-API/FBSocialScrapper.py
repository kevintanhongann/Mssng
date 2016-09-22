# Scrap data from Facebook

import requests
import json
from pprint import pprint


## Need to uses correct access token
r = requests.get('https://graph.facebook.com/v2.7/me/photos?access_token=EAACEdEose0cBACUicLA2R2IAGUtszf3VrZBkeAZCsxlW7nIGLOh3qh0swpVwdTC0tAR39P4ZBHZBTPdyKs0iyXqpPb9unXNlIOn712WKiVuciVGr8CyxhD1RzSIlOaPPRO5XlB96oUEfEmoESTX0fYqTpLlvfa3kY0B2iNOcjQZDZD')

responseJSON = r.json()

#pprint(data)

# Print the second id from the JSON data
pprint(responseJSON["data"][1]["id"])

## Searching FB data

GET /oauth/access_token
    ?client_id={app-id}
    &client_secret={app-secret}
    &grant_type=client_credentials
    
    327292730656510
    
    48d2edb650a868f357921bb19e9367d8
    
    /oauth/access_token?client_id=327292730656510&client_secret=48d2edb650a868f357921bb19e9367d8&grant_type=client_credentials
    
 {
  "access_token": "327292730656510|XpqICtwU2G_3LZmbuY3_ncuV8-I",
  "token_type": "bearer"
}