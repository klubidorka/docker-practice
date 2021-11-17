import csv
import pymysql
from pymysql.cursors import DictCursor

database_name = "db"

if __name__ == '__main__':
    connection = pymysql.connect(host='database', user='klubidorka', password='secure_password',
                                 charset='utf8mb4', cursorclass=DictCursor, port=3306)
    cursor = connection.cursor()
    cursor.execute(f"DROP DATABASE IF EXISTS {database_name};")
    cursor.execute(f"CREATE DATABASE {database_name};")
    cursor.execute(f"USE {database_name}")
    cursor.execute("CREATE TABLE data (text TEXT, number INTEGER);")
    connection.commit()

    with open('data.csv', 'r') as csv_file:
        parser = csv.reader(csv_file, delimiter=';')
        for row in parser:
            if len(row) != 2:
                continue
            text_data, int_data = row
            cursor.execute('INSERT INTO data VALUES (%(text_data)s, %(int_data)s )',
                           {'text_data': text_data, 'int_data': int_data})
    connection.commit()
    cursor.execute("SELECT * FROM data;")
    print(f"Found {len(cursor.fetchall())} entries in data table")
    cursor.close()
    connection.close()
