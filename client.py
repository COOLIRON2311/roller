import http.client
import urllib.parse
SERVER = 'localhost:8080'


def test_roll():
    con = http.client.HTTPConnection(SERVER)
    con.request('POST', '/roll/20'),
    print(con.getresponse().read().decode('utf8'))
    con.close()


def test_rolls():
    con = http.client.HTTPConnection(SERVER)
    con.request('POST', '/rolls', urllib.parse.urlencode({'d6': 1, 'd8': 3}))
    print(con.getresponse().read().decode('utf8'))
    con.close()


def main():
    test_roll()
    # test_rolls()


if __name__ == '__main__':
    main()
