package resources.exceptions;

import java.io.Serializable;
import service.exceptions.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;



public class StandardError implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long timestamp;
    private Integer status;
    private String error;
    this.message = message;
    this.path = path;

    // Getters e setters...
    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}

@ControllerAdvice
public class ResourceExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)

    public ResponseEntity<StandardError> resourceNotFound(ResourceNotFoundException e) {
        HttpStatus status = HttpStatus.NOT_FOUND;
        StandardError(System.currentTimeMillis(), status.value(), "Não encontrado", e.getMessage(), "");
        return ResponseEntity.status(status).body(err);
        //StandardError err = new StandardError(System.currentTimeMillis(), HttpStatus.NOT_FOUND.value(), e.getMessage());
        //return ResponseEntity.status(HttpStatus.NOT_FOUND).body(err);
    }

    // Outros manipuladores de exceção...
}

