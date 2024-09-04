import { inject } from '@angular/core';
import { CanActivateFn, Router } from '@angular/router';
import { jwtDecode } from 'jwt-decode';

export const authGuard: CanActivateFn = (route, state) => {
  const router = inject(Router);
  const token = localStorage.getItem('token_angular');

  if (token != null) {
    // const decodedToken = jwtDecode(token);
    // console.log(decodedToken);
    return true;
  }

  //localStorage.setItem("redirectUrl", state.url);

  router.navigate(["/login"], { queryParams: { stateUrl: state.url } });
  return false;
};
