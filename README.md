# Stock Ticker Microservice
This is the microservice that I am implementing for my partner for CS 361. This takes in the name of a stock in a GET request and returns the stock ticker symbol as a string.

## How to request data
This microservice is exposed as a REST API, so to request data, all you need to do is send a GET request to /api/stock for a single ticker symbol or /api/stocks for a list of ticker symbols.

The single GET request will return a simple string with the ticker symbol of the company given in the request header, while the list of companies will return a list of ticker symbols in a list format.