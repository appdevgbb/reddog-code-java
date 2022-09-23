package com.microsoft.gbb.reddog.accountingservice.config

import io.opentelemetry.api.trace.Span
import java.io.IOException
import javax.servlet.*
import javax.servlet.annotation.WebFilter
import javax.servlet.http.HttpServletResponse

/**
 * The type Add response header filter to add OTEL headers to the response.
 */
@WebFilter("*")
class AddResponseHeaderFilter : Filter {
    @Throws(IOException::class, ServletException::class)
    override fun doFilter(request: ServletRequest, response: ServletResponse, chain: FilterChain) {
        val httpServletResponse = response as HttpServletResponse
        httpServletResponse.setHeader("x-trace-id", Span.current().spanContext.traceId)
        chain.doFilter(request, response)
    }
}