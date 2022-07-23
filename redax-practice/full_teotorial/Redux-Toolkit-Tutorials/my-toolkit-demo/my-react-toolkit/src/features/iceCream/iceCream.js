import { createSlice } from "@reduxjs/toolkit";
import { ordered as cakeOrdered } from "../cake/cakeSlice";

const initialState = {
  numOfIceCream: 50,
};

const iceCreamSlice = createSlice({
  name: "iceCream",
  initialState,
  reducers: {
    orderedIce: (state) => {
      state.numOfIceCream--;
    },
    restockedIce: (state, action) => {
      state.numOfIceCream += action.payload;
    },
  },
  extraReducers: (builder) => {
    builder.addCase(cakeOrdered, (state) => {
      state.numOfIceCream = 0;
    });
  },
});

export default iceCreamSlice.reducer;
export const { orderedIce, restockedIce } = iceCreamSlice.actions;
