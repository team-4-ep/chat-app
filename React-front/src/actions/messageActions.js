import * as actionTypes from "./actionTypes";
import axios from "axios";

export const sendMessage = (msg) => (dispatch) => {
  axios
  .post("http://localhost:8085/chat/send", msg)
  .then((res) => res.data)
  .then((msg) =>
    dispatch({
      type: actionTypes.SEND_MESSAGE,
      message: msg.message,
    })
  )

};

export const addMessage = (msg) => (dispatch) => {
  dispatch({
    type: actionTypes.ADD_MESSAGE,
    message: msg.type,
  });
};

export const getMessage = () => (dispatch) => {
    dispatch({
      type: actionTypes.GET_MESSAGE,
    });
};