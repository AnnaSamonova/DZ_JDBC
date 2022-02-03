package DZ;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Run {
    public static void main(String[] args) throws SQLException {

        String url = "jdbc:mysql://localhost:3306/databaseFilms";
        String login = "root";
        String password = "2016amatoryanna2018";

        // подключаем дрова
        Connection connection = DriverManager.getConnection(url, login, password);
        //  получаем данные из БД
        Statement statement = connection.createStatement();
        //  пишем запрос
        String sql = "SELECT * FROM tableFilms";

        //  получаем множество результатов (запрос.выполнить запрос(сам запрос)
        ResultSet resaltset = statement.executeQuery(sql);

        // создаем коллекцию фильмов, куда их будем складывать
        List<Film> filmsList = new ArrayList<>();

        // достанем всё из табл (пока множество видит запись перед собой)
        while (resaltset.next()){
            Film film = new Film();
            film.setId(resaltset.getLong("id"));// (значение фильма из БД) из множества получаем в виде long колонку id
            film.setFilmName(resaltset.getString("filmName"));
            film.setFilmGenre(resaltset.getString("filmGenre"));
            film.setFilmYear(resaltset.getInt("filmYear"));

            // добавим все в коллекцию
            filmsList.add(film);

        }

        // выводим
        for (Film i : filmsList) {
            System.out.println(i);

        }
    }
}
