/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/module-info.java to edit this template
 */

module com.pessetto.origamismtp {
    requires mail;
    requires javafx.base;
    requires org.jsoup;

    exports com.pessetto.origamismtp;
    exports com.pessetto.origamismtp.filehandlers.inbox;
}
