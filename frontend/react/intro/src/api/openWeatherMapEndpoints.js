import API from "./openWeaterMapConfig";

const getWeather = () => API.get(`/weather?lat=54.6872&lon=25.2797`)
