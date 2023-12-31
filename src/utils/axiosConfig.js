// export const base_url = "http://localhost:5000/api/";
export const base_url = "https://clicky-zoff.onrender.com/api/";


const getTokenFromLocalStorage = localStorage.getItem("customer") ? JSON.parse(localStorage.getItem("customer")):null;

export const config = {
    headers: {
        Authorization: `Bearer ${getTokenFromLocalStorage !== null ? getTokenFromLocalStorage.token : ""
        }`,
        Accept: "application/json",
    }
}