package nextstep.jwp.web.http.session;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class HttpCookieTest {

    @DisplayName("문자열을 쿠키로 파싱할 수 있는지 확인")
    @Test
    void cookieCreateTest() {
        //given
        String rawCookie = "yummy_cookie=choco; tasty_cookie=strawberry; JSESSIONID=656cef62-e3c4-40bc-a8df-94732920ed46";
        //when
        HttpCookie httpCookie = new HttpCookie(rawCookie);
        //then
        assertThat(httpCookie.get("yummy_cookie")).isEqualTo("choco");
        assertThat(httpCookie.get("tasty_cookie")).isEqualTo("strawberry");
        assertThat(httpCookie.get("JSESSIONID")).isEqualTo("656cef62-e3c4-40bc-a8df-94732920ed46");
    }
}