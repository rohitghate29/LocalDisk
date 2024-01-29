import requests
from bs4 import BeautifulSoup

login_url = 'https://colorwiz.in/#/login'
data = {
    'username': '9561268967',
    'password': 'tanay008',
}

with requests.Session() as session:
    session.post(login_url, data=data)
    # Now the session object contains the login state.


response = session.get('https://colorwiz.in/#/luckyhit')


soup = BeautifulSoup(response.text, '')
# Use BeautifulSoup methods to navigate and extract data.
