package pl.com.ergosoft.imageservice.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Image {
    private int id;
    private String name;
    private String url;
}
