package bootcamp.hibernate_practical.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;

@Getter
public class UpdateBookRequest {
    @NotBlank(message = "Title is required")
    private String title;

    @NotBlank(message = "Author is required")
    private String author;

    @NotBlank(message = "Genre is required")
    private String genre;

    @Min(value = 0, message = "Year too early")
    @Max(value = 2026, message = "No time traveling allowed")
    private int publicationYear;

    private boolean available;

    private boolean borrowedStatus;
}
