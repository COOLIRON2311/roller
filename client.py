import http.client
import json
SERVER = 'javaroller.herokuapp.com'
HEAD = {'Content-type': 'application/json'}


def test_roll(dice: int = 20):
    con = http.client.HTTPConnection(SERVER)
    con.request('POST', f'/api/roll/d{dice}'),
    print(con.getresponse().read().decode('utf8'))
    con.close()


def test_rolls(dice: dict[str, int]):
    con = http.client.HTTPConnection(SERVER)
    con.request('POST', '/api/rolls', json.dumps(dice), headers=HEAD)
    print(con.getresponse().read().decode('utf8'))
    con.close()


def main():
    test_roll()
    test_rolls({'d6': 1, 'd8': 3})


if __name__ == '__main__':
    main()
