package com.oncontigo.api.iam.domain.services;


import com.oncontigo.api.iam.domain.model.aggregates.User;
import com.oncontigo.api.iam.domain.model.commands.SignInCommand;
import com.oncontigo.api.iam.domain.model.commands.SignUpCommand;
import org.apache.commons.lang3.tuple.ImmutablePair;

import java.util.Optional;

public interface UserCommandService {
    Optional<ImmutablePair<User, String>> handle(SignInCommand command);
    Optional<User> handle(SignUpCommand command);
}
