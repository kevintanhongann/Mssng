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