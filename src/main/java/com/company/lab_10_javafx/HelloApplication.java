package com.company.lab_10_javafx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    public void TrianglesIn() {

        Triangles_List triangles_list = new Triangles_List();
        final int N = 5;
        final int M = 5;
        final int MAX_SIDE_LENGTH = 25;
        int X1, X2, X3;
        int Y1, Y2, Y3;

        for (int i = 0; i < N; i++) {
            while (!Triangle.isTriangleExists(X1 = (int) (Math.random() * MAX_SIDE_LENGTH) - 5, X2 = (int) (Math.random() * MAX_SIDE_LENGTH) - 5, X3 = (int) (Math.random() * MAX_SIDE_LENGTH) - 5, Y1 = (int) (Math.random() * MAX_SIDE_LENGTH) - 5, Y2 = (int) (Math.random() * MAX_SIDE_LENGTH) - 5, Y3 = (int) (Math.random() * MAX_SIDE_LENGTH) - 5)) {
            }
            triangles_list.add(new Triangle(X1, X2, X3, Y1, Y2, Y3));//Чтобы объект не пересоздавать,называется анонимный объект
        }
//        tableView.getItems().add(
//                new Customer("007", "Jane", "Deer"));
//        tableView.getItems().add(
//                new Customer("006", "John", "Doe"));
//        tableView.getItems().add(
//                new Customer("008", "Mack", "Alamo"));


//        for (final  Triangles_List tri : triangles_list) {
//
//
//
//        }

//
//        return;
    }

    public static void main(String[] args) {


        final int MAX_SIDE_LENGTH = 25;
        final int N = 5;
        final int M = 5;

        int X1, X2, X3;
        int Y1, Y2, Y3;


        System.out.println("\n----------6_Лабараторная---------\n");

        Triangles_List triangles_list = new Triangles_List();
        Triangles_List rightTriangles_list = new Triangles_List();

        rightTriangles_list.add(new Triangle(0, 0, 0, 6, 4, 1));
        rightTriangles_list.add(new Triangle(0, 0, 0, 6, 4, 1));

        for (int i = 0; i < N; i++) {
            while (!Triangle.isTriangleExists(X1 = (int) (Math.random() * MAX_SIDE_LENGTH) - 5, X2 = (int) (Math.random() * MAX_SIDE_LENGTH) - 5, X3 = (int) (Math.random() * MAX_SIDE_LENGTH) - 5, Y1 = (int) (Math.random() * MAX_SIDE_LENGTH) - 5, Y2 = (int) (Math.random() * MAX_SIDE_LENGTH) - 5, Y3 = (int) (Math.random() * MAX_SIDE_LENGTH) - 5)) {
            }
            triangles_list.add(new Triangle(X1, X2, X3, Y1, Y2, Y3));//Чтобы объект не пересоздавать,называется анонимный объект
        }

        for (int i = 0; i < M; i++) {
            while (!Triangle.isTriangleExists(X1 = (int) (Math.random() * MAX_SIDE_LENGTH) - 5, X2 = (int) (Math.random() * MAX_SIDE_LENGTH) - 5, X3 = (int) (Math.random() * MAX_SIDE_LENGTH) - 5, Y1 = (int) (Math.random() * MAX_SIDE_LENGTH) - 5, Y2 = (int) (Math.random() * MAX_SIDE_LENGTH) - 5, Y3 = (int) (Math.random() * MAX_SIDE_LENGTH) - 5)) {
            }
            rightTriangles_list.add(new Triangle(X1, X2, X3, Y1, Y2, Y3));//Чтобы объект не пересоздавать,называется анонимный объект
        }


        System.out.println(triangles_list);

        System.out.println("Triangle with maximal square:" + triangles_list.findTriangle_List_MaxSquare());
        System.out.println("Right triangle with maximal square:" + rightTriangles_list.findTriangle_List_MaxSquare());
        System.out.println("Triangle with minimal square:" + triangles_list.findTriangle_List_MinSquare());
        System.out.println("Right triangle with minimal square:" + rightTriangles_list.findTriangle_List_MinSquare());
        System.out.println("Numbers of identical right Triangles:" + rightTriangles_list.findIdentical_List_Triangles());

        launch();
    }

    @Override
    public void start(Stage stage) throws IOException {

        TableView<Triangle> table = new TableView<Triangle>();

        TableColumn<Triangle, String> x1Col
                = new TableColumn<Triangle, String>("X1");

        TableColumn<Triangle, String> x2Col//
                = new TableColumn<Triangle, String>("X2");

        TableColumn<Triangle, String> x3Col//
                = new TableColumn<Triangle, String>("X3");

        TableColumn<Triangle, String> y1Col //
                = new TableColumn<Triangle, String>("Y1");

        TableColumn<Triangle, String> y2Col //
                = new TableColumn<Triangle, String>("Y2");

        TableColumn<Triangle, String> y3Col //
                = new TableColumn<Triangle, String>("Y3");


        table.getColumns().addAll(x1Col, x2Col, x3Col);


        x1Col.setCellValueFactory(new PropertyValueFactory<>("x1"));
        x2Col.setCellValueFactory(new PropertyValueFactory<>("x2"));
        x3Col.setCellValueFactory(new PropertyValueFactory<>("x3"));
        y1Col.setCellValueFactory(new PropertyValueFactory<>("y1"));
        y2Col.setCellValueFactory(new PropertyValueFactory<>("y2"));
        y3Col.setCellValueFactory(new PropertyValueFactory<>("y3"));


        // Set Sort type for userName column
        x1Col.setSortType(TableColumn.SortType.DESCENDING);
        // y2Col.setSortable(false);

        // Display row data
//        ObservableList<Triangle> list = getTriagnleList();
//        table.setItems(list);

        table.getColumns().addAll(y1Col, y2Col, y3Col);

        StackPane root = new StackPane();
        root.setPadding(new Insets(5));
        root.getChildren().add(table);

        stage.setTitle("Triangles TableView");


        Scene scene = new Scene(root, 450, 300);
        stage.setScene(scene);
        stage.show();


    }
//    private ObservableList<Triangle> getTriagnleList() {
//
//        Triangles_List triangles_list = new Triangles_List();
//        final int N = 5;
//        final int M = 5;
//        final int MAX_SIDE_LENGTH = 25;
//        int X1, X2, X3;
//        int Y1, Y2, Y3;
//
//        for (int i = 0; i < N; i++) {
//            while (!Triangle.isTriangleExists(X1 = (int) (Math.random() * MAX_SIDE_LENGTH) - 5, X2 = (int) (Math.random() * MAX_SIDE_LENGTH) - 5, X3 = (int) (Math.random() * MAX_SIDE_LENGTH) - 5, Y1 = (int) (Math.random() * MAX_SIDE_LENGTH) - 5, Y2 = (int) (Math.random() * MAX_SIDE_LENGTH) - 5, Y3 = (int) (Math.random() * MAX_SIDE_LENGTH) - 5)) {
//            }
//            triangles_list.add(new Triangle(X1, X2, X3, Y1, Y2, Y3));//Чтобы объект не пересоздавать,называется анонимный объект
//        }
//
//
//        Triangle triangle1 = new Triangle(3, 4, 5, 0, 4, 1);
//        Triangle triangle2 = new Triangle(5, 3, 4, 1, 1, 1);
//
//        //ObservableList<Triangle> list = FXCollections.observableArrayList(triangle1,triangle2);
//        ObservableList<Triangle> list = FXCollections.observableArrayList(triangle1,triangle2);
//        return list;


//    }
}