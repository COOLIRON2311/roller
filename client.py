import http.client
import urllib.parse
SERVER = 'localhost:8080'


def test_roll(dice: int = 20):
    con = http.client.HTTPConnection(SERVER)
    con.request('POST', f'/roll/d{dice}'),
    print(con.getresponse().read().decode('utf8'))
    con.close()


def test_rolls(dice: dict[str, int]):
    con = http.client.HTTPConnection(SERVER)
    con.request('POST', '/rolls', urllib.parse.urlencode(dice))
    print(con.getresponse().read().decode('utf8'))
    con.close()


def main():
    test_roll()
    # test_rolls({'d6': 1, 'd8': 3})


if __name__ == '__main__':
    main()