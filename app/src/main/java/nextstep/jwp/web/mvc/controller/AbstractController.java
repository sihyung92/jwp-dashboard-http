package nextstep.jwp.web.mvc.controller;

import static nextstep.jwp.web.http.response.ContentType.HTML;

import nextstep.jwp.web.exception.ApplicationRuntimeException;
import nextstep.jwp.web.http.request.HttpMethod;
import nextstep.jwp.web.http.request.HttpRequest;
import nextstep.jwp.web.http.response.HttpResponse;

public abstract class AbstractController implements Controller {

    @Override
    public void service(HttpRequest request, HttpResponse response) {
        response.setContentType(HTML);
        HttpMethod method = HttpMethod.findByName(request.methodUrl().method().name());
        switch (method) {
            case GET:
                doGet(request, response);
                break;
            case POST:
                doPost(request, response);
                break;
            default:
        }
    }

    protected void doPost(HttpRequest request, HttpResponse response)
        throws ApplicationRuntimeException { /* NOOP */ }

    protected void doGet(HttpRequest request, HttpResponse response)
        throws ApplicationRuntimeException { /* NOOP */ }
}
